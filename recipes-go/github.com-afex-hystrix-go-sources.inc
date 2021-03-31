SRC_URI_append = " https://proxy.golang.org/github.com/afex/hystrix-go/@v/v0.0.0-20180502004556-fa1af6a1f4f5.zip;srcoutput=github.com/afex/hystrix-go;srcinput=github.com/afex/hystrix-go@v0.0.0-20180502004556-fa1af6a1f4f5;downloadfilename=github-com-afex-hystrix-go-0.0.0-20180502004556-fa1af6a1f4f5.zip;name=github-com-afex-hystrix-go"
SRC_URI[github-com-afex-hystrix-go.sha256sum] = "c0e0ea63b57e95784eeeb18ab8988ac2c3d3a17dc729d557c963f391f372301c"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/afex/hystrix-go/LICENSE;md5=f98b1270ed2dd018b8ff68289f22d980 \
"
