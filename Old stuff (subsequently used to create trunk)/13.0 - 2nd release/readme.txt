Files taken from /NTC_A/lib on fokustest on 29/04/08. 

The files were dated 28/04/08 (19:58).

The list of services listed in tlgntc.in appears to be unchanged. In any case I had no reason to believe that the set of online services had been increased or decreased.

The number of .v  files is   60 - same as for Fokus 12.5
The number of olr files is 1002 - 12 MORE THAN Fokus 12.5 ***
The number of blk files is  501 - 6 MORE THAN Fokus 12.5 ***


From database analysis:
1. 13 existing services are changed in some way: arGtBan, arGtCstBan, arInCstBan, arSvBanSvc, arUpCstBan, csActvCtn, csApiBan, csChgCtn, csCrCtn, csMoveCtn, csRsCanCtn, cvSvBan, cvSvCtnAgr
2.  6 new services: csGtFNFBan, csGtFNFCnt, csGtUMAGrp, csLsUMAGrp, csSvFNFBan, csUpdUMAGrp
3.  0 services removed
4. 24 new fields - which accounts for the 13 changed services
5.  0 fields were removed

This 2nd version of v13 has the following extra change(s):
4 extra fields (PBS_INFO_LINK_IND in the output of 4 different service) but only 1 of the services is set to in_use: arGtCstBan
