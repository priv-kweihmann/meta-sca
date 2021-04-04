SRC_URI += "https://proxy.golang.org/github.com/circonus-labs/circonusllhist/@v/v0.2.1.zip;srcoutput=github.com/circonus-labs/circonusllhist;srcinput=github.com/circonus-labs/circonusllhist@v0.2.1;downloadfilename=github-com-circonus-labs-circonusllhist-0.2.1.zip;name=github-com-circonus-labs-circonusllhist"
SRC_URI[github-com-circonus-labs-circonusllhist.sha256sum] = "3f4b67a8b04e0333712ec526d97a52b355d6362434b9cee19fbe43e7052a87b3"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/circonus-labs/circonusllhist/LICENSE.OpenHistogram;md5=a7f7289a97f7dafcd6649a6e8b0ec41f \
    file://src/github.com/circonus-labs/circonusllhist/LICENSE;md5=7717ea3892be31361d7bda3255f676ab \
"

GOSRC_INCLUDEGUARD += "github.com-circonus-labs-circonusllhist-sources.inc"

