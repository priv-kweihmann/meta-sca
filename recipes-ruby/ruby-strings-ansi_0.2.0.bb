SUMMARY = "RubyGem: strings-ansi"
DESCRIPTION = "Methods for processing ANSI escape codes in strings."
HOMEPAGE = "https://github.com/piotrmurach/strings-ansi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4de86edc00706aa95e14a4b5be1cc7e0"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "0540eca28a09401bbfb61d23ba00cc60"
SRC_URI[sha256sum] = "90262d760ea4a94cc2ae8d58205277a343409c288cbe7c29416b1826bd511c88"

GEM_NAME = "strings-ansi"

inherit rubygems
