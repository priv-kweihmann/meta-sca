SUMMARY = "NPM: postcss-syntax"
DESCRIPTION = "Automatically switch PostCSS syntax by file extensions"
HOMEPAGE = "https://github.com/gucong3000/postcss-syntax#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8dc045fd8da5f5d84ad9bf5c7f2d2fa0"

SRC_URI = "https://registry.npmjs.org/postcss-syntax/-/postcss-syntax-0.36.2.tgz"
SRC_URI[md5sum] = "895b65feb43df7198c9ce38addf7925b"
SRC_URI[sha256sum] = "de675aaa44dc5d699c188975a1a0ce76ed8790ca4cd56c158aefaa976a4f8202"

NPM_PKGNAME = "postcss-syntax"

inherit npmhelper
inherit native
