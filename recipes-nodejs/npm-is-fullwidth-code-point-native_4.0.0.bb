SUMMARY = "NPM: is-fullwidth-code-point"
DESCRIPTION = "Check if the character represented by a given Unicode code point is fullwidth"
HOMEPAGE = "https://github.com/sindresorhus/is-fullwidth-code-point#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-fullwidth-code-point/-/is-fullwidth-code-point-4.0.0.tgz"
SRC_URI[md5sum] = "b928f338d9684e1e263cd7dc70498b22"
SRC_URI[sha256sum] = "9a8dab5a5ddb8a5a4c0c36fe30d467e3ef1f738dc1cd12fef773212ed7291cd6"

NPM_PKGNAME = "is-fullwidth-code-point"

inherit npmhelper
inherit native
