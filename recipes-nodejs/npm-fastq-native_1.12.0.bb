SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

DEPENDS = "npm-reusify-native"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.12.0.tgz"
SRC_URI[md5sum] = "651e46aac2847256c411bdbba42b645b"
SRC_URI[sha256sum] = "e83a8fd7d3e73bacd331791ea50a4f7c7f28b09824819bb5f6192d6478248b83"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
