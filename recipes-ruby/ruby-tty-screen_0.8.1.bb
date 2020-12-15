SUMMARY = "RubyGem: tty-screen"
DESCRIPTION = "Terminal screen size detection which works on Linux, OS X and Windows/Cygwin platforms and supports MRI, JRuby, TruffleRuby and Rubinius interpreters."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=51301a5886c31f0a5f89c467cb243c7f"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "64f04117c9e985a04761eb4e8e1e5d70"
SRC_URI[sha256sum] = "6508657c38f32bdca64880abe201ce237d80c94146e1f9b911cba3c7823659a2"

GEM_NAME = "tty-screen"

inherit rubygems
