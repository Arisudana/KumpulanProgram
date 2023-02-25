# INSTALL AND LOAD PACKAGES ################################

library(datasets)  # Load base packages manually

# Installs pacman ("package manager") if needed
if (!require("pacman")) install.packages("pacman")

# These are packages I load every time.
pacman::p_load(pacman, dplyr, GGally, ggplot2, ggthemes, 
               ggvis, httr, lubridate, plotly, rio, rmarkdown, shiny, 
               stringr, tidyr)

# CSV
rio_csv <- import("C:/Users/madea/Desktop/2. order.csv")
head(rio_csv)

#Seperate the unnecesary
pesan <- rio_csv[, c (4:7, (9:10))]
head(pesan)

plot(pesan)

# CLEAN UP #################################################

# Clear environment
rm(list = ls()) 

# Clear packages
p_unload(all)  # Remove all add-ons
detach("package:datasets", unload = TRUE)  # For base

# Clear plots
dev.off()  # But only if there IS a plot

# Clear console
cat("\014")  # ctrl+L
