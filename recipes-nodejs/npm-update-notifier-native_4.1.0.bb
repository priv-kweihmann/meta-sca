SUMMARY = "NPM: update-notifier"
DESCRIPTION = "Update notifications for your CLI app"
HOMEPAGE = "https://github.com/yeoman/update-notifier#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license;md5=893ad33659c31c56c0f4ba00ac978281"

DEPENDS = "npm-boxen-native \
           npm-chalk-native \
           npm-configstore-native \
           npm-has-yarn-native \
           npm-import-lazy-native \
           npm-is-ci-native \
           npm-is-installed-globally-native \
           npm-is-npm-native \
           npm-is-yarn-global-native \
           npm-latest-version-native \
           npm-pupa-native \
           npm-semver-diff-native \
           npm-xdg-basedir-native"

SRC_URI = "https://registry.npmjs.org/update-notifier/-/update-notifier-4.1.0.tgz"
SRC_URI[md5sum] = "da39e37916477e7d112849007165808a"
SRC_URI[sha256sum] = "0284e0d0a13297f949a445da7c5774887f8e7a7e7602b7c818ae2fc7ac4598d6"

NPM_PKGNAME = "update-notifier"

inherit npmhelper
inherit native
