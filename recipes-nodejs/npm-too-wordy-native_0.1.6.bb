SUMMARY = "NPM: too-wordy"
DESCRIPTION = "Find wordy or unnecessary passages in your writing"
HOMEPAGE = "https://github.com/duereg/too-wordy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

SRC_URI = "https://registry.npmjs.org/too-wordy/-/too-wordy-0.1.6.tgz"
SRC_URI[md5sum] = "72e6f88909b998e53e69b309739be0e4"
SRC_URI[sha256sum] = "589c58e020412eab25658f1b3d28a811e0cffee2339a868fa10ca00eca45d65d"

NPM_PKGNAME = "too-wordy"

inherit npmhelper
inherit native
