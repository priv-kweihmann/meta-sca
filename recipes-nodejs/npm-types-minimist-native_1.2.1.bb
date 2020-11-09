SUMMARY = "NPM: @types/minimist"
DESCRIPTION = "TypeScript definitions for minimist"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/minimist/-/minimist-1.2.1.tgz"
SRC_URI[md5sum] = "bda939a2e829e45bc22a889d4a83e122"
SRC_URI[sha256sum] = "ec2e19de653ce00bdcc023e650c4476121a6fe0f5081a81bcf674732029039c1"

NPM_PKGNAME = "@types/minimist"

inherit npmhelper
inherit native

S = "${WORKDIR}/minimist"
