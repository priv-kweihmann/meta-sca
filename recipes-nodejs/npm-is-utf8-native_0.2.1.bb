SUMMARY = "NPM: is-utf8"
DESCRIPTION = "Detect if a buffer is utf8 encoded."
HOMEPAGE = "https://github.com/wayfind/is-utf8#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10d1495ba46609e55e586ab71fa81f45"

SRC_URI = "https://registry.npmjs.org/is-utf8/-/is-utf8-0.2.1.tgz"
SRC_URI[md5sum] = "7c483523b33b0640efedcc6561c545e2"
SRC_URI[sha256sum] = "842b40f45caefe6d44673cb105ca8f852fa57fce75ee2db7923e414d43d65674"

NPM_PKGNAME = "is-utf8"

inherit npmhelper
inherit native
