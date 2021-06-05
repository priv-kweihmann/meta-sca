SRC_URI += "https://proxy.golang.org/github.com/circonus-labs/circonusllhist/@v/v0.3.0.zip;srcoutput=github.com/circonus-labs/circonusllhist;srcinput=github.com/circonus-labs/circonusllhist@v0.3.0;downloadfilename=github-com-circonus-labs-circonusllhist-0.3.0.zip;name=github-com-circonus-labs-circonusllhist"
SRC_URI[github-com-circonus-labs-circonusllhist.sha256sum] = "cd50c52975376b4c8568a84fc0e197171bc723b680f424ce81263d246d73124d"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    HPND \
    ISC \
    MIT \
    OpenSSL \
    TCL \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/circonus-labs/circonusllhist/LICENSE;md5=85043de5b90d6d05b3361ad3d59b09bd \
"

GOSRC_INCLUDEGUARD += "github.com-circonus-labs-circonusllhist-sources.inc"

