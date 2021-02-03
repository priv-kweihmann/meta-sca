SUMMARY = "RubyGem: train-winrm"
DESCRIPTION = "Allows applictaions using Train to speak to Windows using Remote Management; handles authentication, cacheing, and SDK dependency management."
HOMEPAGE = "https://github.com/inspec/train-winrm"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-winrm \
                  ruby-winrm-elevated \
                  ruby-winrm-fs"

SRC_URI[md5sum] = "10048c2ed0d14a65757d20f78a729181"
SRC_URI[sha256sum] = "303facef3ec480e30f83373260834dba4d6d97065f751899f4e304381d1e365a"

GEM_NAME = "train-winrm"

inherit rubygems
