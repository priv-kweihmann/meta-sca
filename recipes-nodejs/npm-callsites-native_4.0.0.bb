SUMMARY = "NPM: callsites"
DESCRIPTION = "Get callsites from the V8 stack trace API"
HOMEPAGE = "https://github.com/sindresorhus/callsites#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/callsites/-/callsites-4.0.0.tgz"
SRC_URI[md5sum] = "ee94093e87555afc70d7bb718e903f4d"
SRC_URI[sha256sum] = "cc313c750da480a6e8ae7155cba4f964cecd1f02876f239e3e11666ab4531ec3"

NPM_PKGNAME = "callsites"

inherit npmhelper
inherit native
