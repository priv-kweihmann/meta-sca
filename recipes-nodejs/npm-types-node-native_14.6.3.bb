SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.6.3.tgz"
SRC_URI[md5sum] = "0072072e407c71adb23d1ddc22a8c374"
SRC_URI[sha256sum] = "db35d889b0be3a458b45e6d141435ecaabdf5859cca81ba2e948c8f3bc02f4d8"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
