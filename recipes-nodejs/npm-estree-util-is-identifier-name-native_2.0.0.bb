SUMMARY = "NPM: estree-util-is-identifier-name"
DESCRIPTION = "Check if something can be an ecmascript (javascript) identifier name"
HOMEPAGE = "https://github.com/wooorm/estree-util-is-identifier-name#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/estree-util-is-identifier-name/-/estree-util-is-identifier-name-2.0.0.tgz"
SRC_URI[md5sum] = "cb73c13a1b89a39fdd4531ea91d9e032"
SRC_URI[sha256sum] = "fe1da9ca4781d527f4965830eddb6f7dc01024402f31210fbe2c55dc90186ef6"

NPM_PKGNAME = "estree-util-is-identifier-name"

inherit npmhelper
inherit native
