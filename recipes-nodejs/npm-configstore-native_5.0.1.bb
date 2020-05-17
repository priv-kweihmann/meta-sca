SUMMARY = "NPM: configstore"
DESCRIPTION = "Easily load and save config without having to think about where and how"
HOMEPAGE = "https://github.com/yeoman/configstore#readme"

DEPENDS = "npm-dot-prop-native npm-graceful-fs-native npm-make-dir-native npm-unique-string-native npm-write-file-atomic-native npm-xdg-basedir-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license;md5=2838f6acc24e1d83ccb791d68f311c29"

SRC_URI = "https://registry.npmjs.org/configstore/-/configstore-5.0.1.tgz"
SRC_URI[md5sum] = "674881a9a46bb4c544c69332407f3b7d"
SRC_URI[sha256sum] = "05e5930400029c6d79f5d36c4eb4ce3dc88cd9f25f6aed3c2d2e53ff3694fce5"

S = "${WORKDIR}/package"

NPM_PKGNAME = "configstore"

inherit npmhelper
inherit native
