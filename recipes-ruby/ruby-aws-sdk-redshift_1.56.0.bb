SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "52c2320f01bb0cdff088936074ee88fd"
SRC_URI[sha256sum] = "76fef9c6d877fd976b944ce2faa048b0c3f8525754ca94254271ae8f8be82711"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
