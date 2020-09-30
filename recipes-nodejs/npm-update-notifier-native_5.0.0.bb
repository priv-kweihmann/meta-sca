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

SRC_URI = "https://registry.npmjs.org/update-notifier/-/update-notifier-5.0.0.tgz"
SRC_URI[md5sum] = "685134b19b0d4dbf156d289971b34877"
SRC_URI[sha256sum] = "ba4f1ae3d67475eed2ce10036829b669e6cf803870c50aba666308ddbc98270c"

NPM_PKGNAME = "update-notifier"

inherit npmhelper
inherit native
