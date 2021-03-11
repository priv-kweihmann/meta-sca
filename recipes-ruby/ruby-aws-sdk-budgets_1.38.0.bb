SUMMARY = "RubyGem: aws-sdk-budgets"
DESCRIPTION = "Official AWS Ruby gem for AWS Budgets (AWSBudgets)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "200244da9dffacabf60eee838ece9891"
SRC_URI[sha256sum] = "dd841360e99583c877344cfc9ba12f9d0415cda713729620795deeb32bb10b13"

GEM_NAME = "aws-sdk-budgets"

inherit rubygems
