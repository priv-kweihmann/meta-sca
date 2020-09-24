SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.11.2.tgz"
SRC_URI[md5sum] = "1ecd535210525d9cddbb9aee86666172"
SRC_URI[sha256sum] = "55d788419a77ed58b1d14e933fb75866b98ee44939ead90c4a1f0a19478bf781"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
