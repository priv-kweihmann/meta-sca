SUMMARY = "NPM: cli-width"
DESCRIPTION = "Get stdout window width, with two fallbacks, tty and then a default."
HOMEPAGE = "https://github.com/knownasilya/cli-width"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cfb072f1bc7e564626cd6b5164a13e59"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cli-width/-/cli-width-3.0.0.tgz"
SRC_URI[md5sum] = "f369af815d0df63a0a857dffd38a0ffc"
SRC_URI[sha256sum] = "253654dc008e0511b2534c4e114b27214766a47f4316e2e60ff45b6e82be9992"

NPM_PKGNAME = "cli-width"

inherit npmhelper
inherit native
