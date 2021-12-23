SUMMARY = "NPM: string_decoder"
DESCRIPTION = "The string_decoder module from Node core"
HOMEPAGE = "https://github.com/nodejs/string_decoder"

DEPENDS = "npm-safe-buffer-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c"

SRC_URI = "https://registry.npmjs.org/string_decoder/-/string_decoder-1.3.0.tgz"
SRC_URI[md5sum] = "c1e79feffd41cad5e800b0b94963ef24"
SRC_URI[sha256sum] = "7d036900940345e423538371ae45b23bfaf4b454bc398c6ba604063b0597b3ad"

NPM_PKGNAME = "string_decoder"

inherit npmhelper
inherit native
