SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "78a321766d10efa50a99ec2242c2abae"
SRC_URI[sha256sum] = "9f34b501a374f38551a5c0bd97670039a5ab37d6b47c049660042e301c0745ff"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
