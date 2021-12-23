SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

DEPENDS = "npm-reusify-native"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.13.0.tgz"
SRC_URI[md5sum] = "15bbc6115c9f4b528f98908efc5e7168"
SRC_URI[sha256sum] = "0a2f545d204d5cfbb31806958d6a559bd3209891cd6bd3dce853c5d401e5c2e3"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
