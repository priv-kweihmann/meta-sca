SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

DEPENDS = "npm-reusify-native"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.9.0.tgz"
SRC_URI[md5sum] = "c9cab6c1ead76314d3bb2b7a4077e9d5"
SRC_URI[sha256sum] = "8abcff0d93b32c29674d9a21715d80354af7e9fb0033b76a471765561d1a6872"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
