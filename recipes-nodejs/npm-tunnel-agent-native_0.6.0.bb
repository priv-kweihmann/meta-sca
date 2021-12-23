SUMMARY = "NPM: tunnel-agent"
DESCRIPTION = "HTTP proxy tunneling agent. Formerly part of mikeal/request, now a standalone module."
HOMEPAGE = "https://github.com/mikeal/tunnel-agent#readme"

DEPENDS = "npm-safe-buffer-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3f8ead5440d1c311b45be065d135d90"

SRC_URI = "https://registry.npmjs.org/tunnel-agent/-/tunnel-agent-0.6.0.tgz"
SRC_URI[md5sum] = "0fa5d2c7d1fc791c54124d9558ed39aa"
SRC_URI[sha256sum] = "d3e3c04a50d6d2fa40654bf764fa1792f797bd5a62c69d03dceaa7d4a85c5012"

S = "${WORKDIR}/package"

NPM_PKGNAME = "tunnel-agent"

inherit npmhelper
inherit native
