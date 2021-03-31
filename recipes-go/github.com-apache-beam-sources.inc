SRC_URI_append = " https://proxy.golang.org/github.com/apache/beam/@v/v2.28.0+incompatible.zip;srcoutput=github.com/apache/beam;srcinput=github.com/apache/beam@v2.28.0+incompatible;downloadfilename=github-com-apache-beam-2.28.0+incompatible.zip;name=github-com-apache-beam"
SRC_URI[github-com-apache-beam.sha256sum] = "6a83c6020fa7777e90fdae710b10f3e35e2e32923a38f4bab5bf63aefa07ce5f"

MOD_LICENSE_append = " \
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/apache/beam/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
    file://src/github.com/apache/beam/release/go-licenses/get-licenses.sh;md5=8a86b59d6600aace15fd7623ff86af8e \
    file://src/github.com/apache/beam/runners/google-cloud-dataflow-java/worker/src/main/resources/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/apache/beam/sdks/java/container/license_scripts/license_script.sh;md5=f183884aeaa2d93459f423d57cdefe9a \
    file://src/github.com/apache/beam/sdks/python/container/license_scripts/manual_licenses/enum34/LICENSE;md5=0a97a53a514564c20efd7b2e8976c87e \
    file://src/github.com/apache/beam/sdks/python/container/license_scripts/manual_licenses/singledispatch/LICENSE;md5=5e6896d8cfba370e833d8166c7618ded \
    file://src/github.com/apache/beam/sdks/python/container/license_scripts/manual_licenses/termcolor/LICENSE;md5=e66f46c675aae457f994a829c35dd86c \
    file://src/github.com/apache/beam/website/notebooks/imports/license.md;md5=2227d660dc4b948d0101068dda5b2418 \
"
