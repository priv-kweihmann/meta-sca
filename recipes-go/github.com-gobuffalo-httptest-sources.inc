SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/httptest/@v/v1.5.0.zip;srcoutput=github.com/gobuffalo/httptest;srcinput=github.com/gobuffalo/httptest@v1.5.0;downloadfilename=github-com-gobuffalo-httptest-1.5.0.zip;name=github-com-gobuffalo-httptest"
SRC_URI[github-com-gobuffalo-httptest.sha256sum] = "85f9ac952177a9a8334419b8158a58c097f8cb4a3d8c0c04fb645b62a0564bed"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/httptest/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
    file://src/github.com/gobuffalo/httptest/internal/takeon/github.com/ajg/form/LICENSE;md5=9222c175634cb90e39bccc6d2943f314 \
    file://src/github.com/gobuffalo/httptest/internal/takeon/github.com/markbates/hmax/LICENSE.txt;md5=890c6789328dbe7f15a6e33bcbf1a58d \
    file://src/github.com/gobuffalo/httptest/internal/takeon/github.com/markbates/hmax/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-httptest-sources.inc"

