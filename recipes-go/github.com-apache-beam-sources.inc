SRC_URI += "https://proxy.golang.org/github.com/apache/beam/@v/v2.38.0+incompatible.zip;srcoutput=github.com/apache/beam;srcinput=github.com/apache/beam@v2.38.0+incompatible;downloadfilename=github-com-apache-beam-2.38.0+incompatible.zip;name=github-com-apache-beam"
SRC_URI[github-com-apache-beam.sha256sum] = "ab91d9d6a3415c76020917d7e6a171f86abb5434f5135c87b86fead93c7a7a06"
GOSRC_REMOVEDIRS += "github.com/apache/beam/sdks/go/test/integration/xlang"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
    Python-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/apache/beam/LICENSE.python;md5=57b414b3da72a64613f4c88925d7135b \
    file://src/github.com/apache/beam/LICENSE;md5=73a5bbb637837b33f935dd50e5d05143 \
    file://src/github.com/apache/beam/release/go-licenses/get-licenses.sh;md5=dde0000ee59cdfc373250f3eb65ffca8 \
    file://src/github.com/apache/beam/runners/google-cloud-dataflow-java/worker/src/main/resources/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/apache/beam/website/notebooks/imports/license.md;md5=2227d660dc4b948d0101068dda5b2418 \
"

GOSRC_INCLUDEGUARD += "github.com-apache-beam-sources.inc"

