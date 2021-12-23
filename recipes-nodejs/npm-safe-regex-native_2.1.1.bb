SUMMARY = "NPM: safe-regex"
DESCRIPTION = "detect possibly catastrophic, exponential-time regular expressions"
HOMEPAGE = "https://github.com/davisjam/safe-regex"

DEPENDS = "npm-regexp-tree-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4892988a3e2880e1d9b240a220187a1"

SRC_URI = "https://registry.npmjs.org/safe-regex/-/safe-regex-2.1.1.tgz"
SRC_URI[md5sum] = "119c47cd8cca53ed68af223f02cb7623"
SRC_URI[sha256sum] = "baad562115a5f87acf3e9fa2343c80b60d9f8d240da3200af6e00fb4c4c95e27"

NPM_PKGNAME = "safe-regex"

inherit npmhelper
inherit native
