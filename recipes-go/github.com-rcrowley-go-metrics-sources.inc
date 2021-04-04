SRC_URI += "https://proxy.golang.org/github.com/rcrowley/go-metrics/@v/v0.0.0-20201227073835-cf1acfcdf475.zip;srcoutput=github.com/rcrowley/go-metrics;srcinput=github.com/rcrowley/go-metrics@v0.0.0-20201227073835-cf1acfcdf475;downloadfilename=github-com-rcrowley-go-metrics-0.0.0-20201227073835-cf1acfcdf475.zip;name=github-com-rcrowley-go-metrics"
SRC_URI[github-com-rcrowley-go-metrics.sha256sum] = "e4dbd20c185cb05019fd7d4a361266bd5d182938f49fd9577df4d12c16dc81c3"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rcrowley/go-metrics/LICENSE;md5=1bdf5d819f50f141366dabce3be1460f \
"

GOSRC_INCLUDEGUARD += "github.com-rcrowley-go-metrics-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stathat-go-sources.inc', '', 'github.com-stathat-go-sources.inc', d)}
