SUMMARY = "NPM: path-exists"
DESCRIPTION = "Check if a path exists"
HOMEPAGE = "https://github.com/sindresorhus/path-exists#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/path-exists/-/path-exists-5.0.0.tgz"
SRC_URI[md5sum] = "5603551b660e5c4fa94f1b1b65627b88"
SRC_URI[sha256sum] = "9b93b98cd7eadd576ce1c7cce47eb8b46fe4602e1807b40532122c7bf47a4d9f"

NPM_PKGNAME = "path-exists"

inherit npmhelper
inherit native
