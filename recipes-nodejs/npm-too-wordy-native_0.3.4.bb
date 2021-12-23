SUMMARY = "NPM: too-wordy"
DESCRIPTION = "Find wordy or unnecessary passages in your writing"
HOMEPAGE = "https://github.com/duereg/too-wordy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/too-wordy/-/too-wordy-0.3.4.tgz"
SRC_URI[md5sum] = "edceee83ed888d670c2ef881908405b7"
SRC_URI[sha256sum] = "db7b4d833bba6535e97ee7daca97824125dafb4c8deb6e139ee5b5dacc90d908"

NPM_PKGNAME = "too-wordy"

inherit npmhelper
inherit native
