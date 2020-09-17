SUMMARY = "NPM: line-column"
DESCRIPTION = "Convert efficiently index to/from line-column in a string"
HOMEPAGE = "https://github.com/io-monad/line-column"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=475c651f933170411f6259e257c2dd2f"

DEPENDS = "npm-isarray-native \
           npm-isobject-native"

SRC_URI = "https://registry.npmjs.org/line-column/-/line-column-1.0.2.tgz"
SRC_URI[md5sum] = "0cc70bac8bb548e25b9bda83328f7f6e"
SRC_URI[sha256sum] = "a83dd7519a02d29a503754638d4e8343aeaa3e060383c796b54193881fef3267"

NPM_PKGNAME = "line-column"

inherit npmhelper
inherit native
