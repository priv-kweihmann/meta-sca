SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://lib/plugins/inspec-init/templates/profiles/gcp/inspec.yml;beginline=6;endline=6;md5=cfb5ff7823bc166fac8853e293b76fd7"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-faraday-middleware \
                  ruby-inspec-core \
                  ruby-train \
                  ruby-train-aws \
                  ruby-train-habitat \
                  ruby-train-winrm"

SRC_URI[md5sum] = "371aaad025f85d2fedb967b27be96e87"
SRC_URI[sha256sum] = "b34918ed6dc4652fe48a99c9b38256e495ebd8550d8706cecdce1839d140b4d6"

GEM_NAME = "inspec"

inherit rubygems
