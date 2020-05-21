SUMMARY = "NPM: @types/responselike"
DESCRIPTION = "TypeScript definitions for responselike"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/responselike/-/responselike-1.0.0.tgz"
SRC_URI[md5sum] = "cbdbffc960e4f73517e140ee24d1fcb0"
SRC_URI[sha256sum] = "1aad40913e81849c6a3e7a6c40b61fecdbc082b478a74c2221e8015c47da9484"

NPM_PKGNAME = "@types/responselike"

inherit npmhelper
inherit native

S = "${WORKDIR}/responselike"
