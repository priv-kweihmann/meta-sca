SUMMARY = "NPM: find-up"
DESCRIPTION = "Find a file or directory by walking up parent directories"
HOMEPAGE = "https://github.com/sindresorhus/find-up#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-locate-path-native \
           npm-path-exists-native"

SRC_URI = "https://registry.npmjs.org/find-up/-/find-up-6.2.0.tgz"
SRC_URI[md5sum] = "e5819b7fe53d642abbe480ede78fb372"
SRC_URI[sha256sum] = "42a68beece5fffc84c48cc056a797c45a8089d35129c4c6b55d856406d94842c"

NPM_PKGNAME = "find-up"

inherit npmhelper
inherit native
