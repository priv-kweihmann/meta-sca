SRC_URI_append = " https://proxy.golang.org/github.com/influxdata/influxdb1-client/@v/v0.0.0-20200827194710-b269163b24ab.zip;srcoutput=github.com/influxdata/influxdb1-client;srcinput=github.com/influxdata/influxdb1-client@v0.0.0-20200827194710-b269163b24ab;downloadfilename=github-com-influxdata-influxdb1-client-0.0.0-20200827194710-b269163b24ab.zip;name=github-com-influxdata-influxdb1-client"
SRC_URI[github-com-influxdata-influxdb1-client.sha256sum] = "ed01c8c61c067924a350e68af2bf16d90952e094a9fd5bbf61db82a66576be14"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/influxdata/influxdb1-client/LICENSE;md5=2ffc0ea8de949bc0d593daac394871f6 \
"
