SUMMARY = "RubyGem: winrm-elevated"
DESCRIPTION = "Ruby library for running commands via WinRM as elevated through a scheduled task"
HOMEPAGE = "https://github.com/WinRb/winrm-elevated"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-erubi \
                  ruby-winrm \
                  ruby-winrm-fs"

SRC_URI[md5sum] = "05ca35b480ecb6a89f141c4a27512040"
SRC_URI[sha256sum] = "ed733dd163ced9b6acc6a01d331f539946b59e40adbcd63941f62a8c6254b4d2"

GEM_NAME = "winrm-elevated"

inherit rubygems
