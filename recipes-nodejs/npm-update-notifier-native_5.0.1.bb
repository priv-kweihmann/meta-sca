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
           npm-semver-native \
           npm-xdg-basedir-native"

SRC_URI = "https://registry.npmjs.org/update-notifier/-/update-notifier-5.0.1.tgz"
SRC_URI[md5sum] = "cd654ba2b2b4c0e345bb5b609e075b5d"
SRC_URI[sha256sum] = "ec1b5922b9678ce70dfd88fe95120c628e7156b0831bfd6b91ca0c2c341166c9"

NPM_PKGNAME = "update-notifier"

inherit npmhelper
inherit native
