SUMMARY = "RubyGem: aws-sdk-sqs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Queue Service (Amazon SQS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "25e17d7d31ceabac12251ed7c236231f"
SRC_URI[sha256sum] = "a3cf5277395ea80e188dc6219d5ae468f76bd8272f59d91a32f82f0497dcb9e7"

GEM_NAME = "aws-sdk-sqs"

inherit rubygems
