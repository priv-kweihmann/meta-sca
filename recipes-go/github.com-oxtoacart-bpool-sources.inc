SRC_URI += "https://proxy.golang.org/github.com/oxtoacart/bpool/@v/v0.0.0-20190530202638-03653db5a59c.zip;srcoutput=github.com/oxtoacart/bpool;srcinput=github.com/oxtoacart/bpool@v0.0.0-20190530202638-03653db5a59c;downloadfilename=github-com-oxtoacart-bpool-0.0.0-20190530202638-03653db5a59c.zip;name=github-com-oxtoacart-bpool"
SRC_URI[github-com-oxtoacart-bpool.sha256sum] = "6816ec3a6f197cbee0ba6ddb9ec70958bc28870e59864b24e43da0c858079a1b"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/oxtoacart/bpool/LICENSE;md5=30b3d64fa90a25a2cf669e5c149b923d \
"

GOSRC_INCLUDEGUARD += "github.com-oxtoacart-bpool-sources.inc"

