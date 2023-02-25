#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int nilai, nilai_lulus = 0, nilai_tidak_lulus = 0;
    int pengulangan;

    printf("Jumlah Nilai yang ingin dimasukkan = ");
    scanf("%d", &pengulangan);
    for (int i = 1; i <= pengulangan; i++)
    {
        printf("Masukkan Nilai Ke-%d = ", i);
        scanf("%d", nilai);
        if (nilai > 60)
        {
            nilai_lulus = nilai_lulus + 1;
        }
        else
        {
            nilai_tidak_lulus = nilai_tidak_lulus + 1;
        }
    }
    printf("Dari %d nilai, ada %d yang lulus, dan %d yang tidak lulus", pengulangan, nilai_lulus, nilai_tidak_lulus);

    return 0;
}