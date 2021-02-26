SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

DEPENDS = "npm-reusify-native"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.11.0.tgz"
SRC_URI[md5sum] = "805fc5162e8165a6d129a4b7f32d8ef0"
SRC_URI[sha256sum] = "e9f0540bef8ac0bdc8b4ef3471f80ab2020437caf449af8781ce403cf4eb7285"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
