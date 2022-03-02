SRC_URI += "https://proxy.golang.org/github.com/influxdata/influxdb1-client/@v/v0.0.0-20220302092344-a9ab5670611c.zip;srcoutput=github.com/influxdata/influxdb1-client;srcinput=github.com/influxdata/influxdb1-client@v0.0.0-20220302092344-a9ab5670611c;downloadfilename=github-com-influxdata-influxdb1-client-0.0.0-20220302092344-a9ab5670611c.zip;name=github-com-influxdata-influxdb1-client"
SRC_URI[github-com-influxdata-influxdb1-client.sha256sum] = "71cde4d7b82c60edcecc528d44eac250071f9720e2e1d6ea279309a36e2a63e5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/influxdata/influxdb1-client/LICENSE;md5=2ffc0ea8de949bc0d593daac394871f6 \
"

GOSRC_INCLUDEGUARD += "github.com-influxdata-influxdb1-client-sources.inc"

