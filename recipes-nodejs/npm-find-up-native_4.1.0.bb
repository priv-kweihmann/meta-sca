SUMMARY = "NPM: find-up"
DESCRIPTION = "Find a file or directory by walking up parent directories"
HOMEPAGE = "https://github.com/sindresorhus/find-up#readme"

DEPENDS = "npm-locate-path-native npm-path-exists-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/find-up/-/find-up-4.1.0.tgz"
SRC_URI[md5sum] = "aa0b377135f4af38d106db8b84606924"
SRC_URI[sha256sum] = "33a9b0535306d2e05e0a27088b68344b52ac767d576ef60b7ab173aa0d5a26eb"

NPM_PKGNAME = "find-up"

inherit npmhelper
inherit native
