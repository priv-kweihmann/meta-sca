SRC_URI += "https://proxy.golang.org/github.com/op/go-logging/@v/v0.0.0-20160315200505-970db520ece7.zip;srcoutput=github.com/op/go-logging;srcinput=github.com/op/go-logging@v0.0.0-20160315200505-970db520ece7;downloadfilename=github-com-op-go-logging-0.0.0-20160315200505-970db520ece7.zip;name=github-com-op-go-logging"
SRC_URI[github-com-op-go-logging.sha256sum] = "c506eace74028656eb28677a4c162f9c023ce2f9c0207354ba80cca89f11b461"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/op/go-logging/LICENSE;md5=d01d49c2816e0112c83b3a9f77029b8a \
"

GOSRC_INCLUDEGUARD += "github.com-op-go-logging-sources.inc"

