SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.16.tgz"
SRC_URI[md5sum] = "3994350a427ce8a966e5363bb84954ff"
SRC_URI[sha256sum] = "3172f7e2219e1471a88565bcb5bda29452cef447e94fbba4e512e1ce2db1716f"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
