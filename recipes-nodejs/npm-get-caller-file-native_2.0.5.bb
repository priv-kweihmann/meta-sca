SUMMARY = "NPM: get-caller-file"
DESCRIPTION = "[![Build Status](https://travis-ci.org/stefanpenner/get-caller-file.svg?branch=master)](https://travis-ci.org/stefanpenner/get-caller-file) [![Build status](https://ci.appveyor.com/api/projects/status/ol2q94g1932cy14a/branch/master?svg=true)](https://ci.a"
HOMEPAGE = "https://github.com/stefanpenner/get-caller-file#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d21aa422a43e9693d50143d612b58967"

SRC_URI = "https://registry.npmjs.org/get-caller-file/-/get-caller-file-2.0.5.tgz"
SRC_URI[md5sum] = "1b9de5ead51b8886be998f58fdb96476"
SRC_URI[sha256sum] = "7b13e1c81949ff4c1baae4ac4e34990492d5e8a86dab7e3b90027b1f5126935f"

NPM_PKGNAME = "get-caller-file"

inherit npmhelper
inherit native
