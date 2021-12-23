SUMMARY = "NPM: configstore"
DESCRIPTION = "Easily load and save config without having to think about where and how"
HOMEPAGE = "https://github.com/yeoman/configstore#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license;md5=2838f6acc24e1d83ccb791d68f311c29"

DEPENDS = "npm-dot-prop-native \
           npm-graceful-fs-native \
           npm-unique-string-native \
           npm-write-file-atomic-native \
           npm-xdg-basedir-native"

SRC_URI = "https://registry.npmjs.org/configstore/-/configstore-6.0.0.tgz"
SRC_URI[md5sum] = "ac98bb7b9a621a304f775d6f89ef3c32"
SRC_URI[sha256sum] = "21ca95d57d02053aa5c5386578fdb3cf8df79ab8a4e0b1a5cd360d2440e7bbe7"

NPM_PKGNAME = "configstore"

inherit npmhelper
inherit native
