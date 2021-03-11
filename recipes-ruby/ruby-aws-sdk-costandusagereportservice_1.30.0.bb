SUMMARY = "RubyGem: aws-sdk-costandusagereportservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Cost and Usage Report Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "be934ab6900668750b550d615db8223e"
SRC_URI[sha256sum] = "0e1826610bc8f12490040decae9d6be7c4a2f0e35ff1888b16d2adfdec2257b9"

GEM_NAME = "aws-sdk-costandusagereportservice"

inherit rubygems
