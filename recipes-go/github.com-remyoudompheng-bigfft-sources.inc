SRC_URI += "https://proxy.golang.org/github.com/remyoudompheng/bigfft/@v/v0.0.0-20230129092748-24d4a6f8daec.zip;srcoutput=github.com/remyoudompheng/bigfft;srcinput=github.com/remyoudompheng/bigfft@v0.0.0-20230129092748-24d4a6f8daec;downloadfilename=github-com-remyoudompheng-bigfft-0.0.0-20230129092748-24d4a6f8daec.zip;name=github-com-remyoudompheng-bigfft"
SRC_URI[github-com-remyoudompheng-bigfft.sha256sum] = "9be16c32c384d55d0f7bd7b03f1ff1e9a4e4b91b000f0aa87a567a01b9b82398"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/remyoudompheng/bigfft/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81 \
"

GOSRC_INCLUDEGUARD += "github.com-remyoudompheng-bigfft-sources.inc"

